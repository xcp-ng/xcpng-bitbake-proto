inherit xcp-ng-rpm

SRCREV = "e67d79de92869f96c9e291e96dd513a2a444d4d2"

# do not pull xcp-ng-release
PACKAGE_NEEDS_BOOTSTRAP = "1"
DEPENDS = "branding-xcp-ng"
