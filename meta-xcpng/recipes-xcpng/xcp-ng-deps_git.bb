inherit xcp-ng-rpm

SRCREV = "784988e7c3260665c3d4c90b7e71fe2d9d0ca870"

RDEPENDS = " \
xcp-ng-release \
xcp-ng-config \
kernel \
grub2 \
blktap \
guest-templates-json \
varstored \
vncterm \
xapi \
xo-lite \
xsconsole \
xcp-ng-pv-tools \
xcp-ng-xapi-plugins \
xcp-featured \
"

# pulls qemu, not yet on aarch64
RDEPENDS:remove:aarch64 = "vncterm"
