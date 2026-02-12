
inherit dnf-bridge

PN = "libvma"
PE = "0"
PV = "9.8.60"
PR = "3.el10"
PACKAGES = "libvma libvma-utils libvma-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libvma-9.8.60-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libvma = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvma-9.8.60-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libvma}"
RDEPENDS:libvma = " \
 libgcc \
 libnl3 \
 librdmacm \
 libstdc++ \
 bash \
 libibverbs \
 glibc \
"

URI_libvma-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libvma-utils-9.8.60-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libvma-utils}"
RDEPENDS:libvma-utils = " \
 glibc \
 libvma \
 libgcc \
 libstdc++ \
"

URI_libvma-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libvma-devel-9.8.60-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libvma-devel}"
RDEPENDS:libvma-devel = " \
 libvma \
"
