# Runs tests for each exercise, exiting with 1 if a test fails.
# Must run from the project root directory!

projpath=$(pwd)

for solutiondir in $(ls -d */ | grep -v "_scripts" | sort)
do
    cd "$projpath/$solutiondir"
    
    echo "Running tests in $(pwd) ..."

    if ! gradle test; then
        echo "A test in $solutiondir failed."
        exit 1
    fi

    echo
done
