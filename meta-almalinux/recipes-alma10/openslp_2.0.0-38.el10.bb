
inherit dnf-bridge

PN = "openslp"
PE = "0"
PV = "2.0.0"
PR = "38.el10"
PACKAGES = "openslp openslp-devel openslp-server"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/openslp-2.0.0-38.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_openslp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/openslp-2.0.0-38.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_openslp}"
RDEPENDS:openslp = " \
 glibc \
"

URI_openslp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/openslp-devel-2.0.0-38.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_openslp-devel}"
RDEPENDS:openslp-devel = " \
 openslp \
"

URI_openslp-server = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/openslp-server-2.0.0-38.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_openslp-server}"
RDEPENDS:openslp-server = " \
 systemd-libs \
 iproute \
 openslp \
 bash \
 glibc \
"
