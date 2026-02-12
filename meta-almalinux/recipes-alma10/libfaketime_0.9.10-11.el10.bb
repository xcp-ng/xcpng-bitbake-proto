
inherit dnf-bridge

PN = "libfaketime"
PE = "0"
PV = "0.9.10"
PR = "11.el10"
PACKAGES = "libfaketime"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/libfaketime-0.9.10-11.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libfaketime = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libfaketime-0.9.10-11.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libfaketime}"
RDEPENDS:libfaketime = " \
 glibc \
 libgcc \
"
