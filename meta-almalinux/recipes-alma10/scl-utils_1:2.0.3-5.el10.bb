
inherit dnf-bridge

PN = "scl-utils"
PE = "1"
PV = "2.0.3"
PR = "5.el10"
PACKAGES = "scl-utils scl-utils-build"


URI_scl-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/scl-utils-2.0.3-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:scl-utils = " \
 glibc \
 environment-modules \
 bash \
 rpm-libs \
"

URI_scl-utils-build = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/scl-utils-build-2.0.3-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:scl-utils-build = " \
 redhat-rpm-config \
 bash \
 iso-codes \
"
