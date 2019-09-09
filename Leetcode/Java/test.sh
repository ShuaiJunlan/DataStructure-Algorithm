# Start session 1
# shellcheck disable=SC2164
cd ~/private/docs
ls -laF | more
cat foo.txt bar.txt zorch.txt > somewhere
exit
# End session 1
# Start session 2
vi scores.txt
mailx john_doe@somewhere.com
exit
# End session 2