inherit xcp-ng-rpm

SRCREV = "33fa214194831220521d672aa7c153c92aa046ca"

# do not pull xcp-ng-release
PACKAGE_NEEDS_BOOTSTRAP = "1"
DEPENDS = "branding-xcp-ng"
