inherit xcp-ng-rpm

SRCREV = "99d775a5a59678d6f242b28e6eb14b83067aff77"

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
