
inherit dnf-bridge

PN = "patch"
PE = "0"
PV = "2.7.6"
PR = "26.el10"
PACKAGES = "patch"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/patch-2.7.6-26.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_patch = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/patch-2.7.6-26.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_patch}"
RDEPENDS:patch = " \
 glibc \
 libselinux \
 ed \
 libattr \
"
