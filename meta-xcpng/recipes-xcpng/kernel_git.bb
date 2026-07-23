inherit xcp-ng-rpm

SRCREV = "2246be73c6da1016cf5d3a5a9051b08996bd425c"
# FIXME why does kabichk with "required file not found"?
XCPNGDEV_BUILD_OPTS = " \
  --rpmbuild-opts='--without kabichk' \
"
