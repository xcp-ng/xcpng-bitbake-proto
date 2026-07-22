#!/bin/sh
set -e

# Quick and dirty check for recipes in need of an update
# Checks rev of ydi/9 if it exists, else of master

cd meta-xcpng/recipes-xcpng/

for f in *bb; do
    if ! grep -q "inherit xcp-ng-rpm" $f; then
        continue
    fi
    rev=$(grep "SRCREV =" $f | cut -d'"' -f2)
    p=${f%.bb}
    p=${p%_git}
    echo -n "$p ... "
    master=$(git ls-remote https://github.com/xcp-ng-rpms/$p refs/heads/master|cut -f1)
    ydi9=$(git ls-remote https://github.com/xcp-ng-rpms/$p refs/heads/ydi/9|cut -f1)
    if [ -n "$ydi9" ]; then
        echo -n "ydi/9 ... "
        ref=$ydi9
    else
        echo -n "master ... "
        ref=$master
    fi
    if [ $rev = $ref ]; then
        echo uptodate
    else
        echo $ref
    fi
done
