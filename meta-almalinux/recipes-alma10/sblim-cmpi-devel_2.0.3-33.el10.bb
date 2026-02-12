
inherit dnf-bridge

PN = "sblim-cmpi-devel"
PE = "0"
PV = "2.0.3"
PR = "33.el10"
PACKAGES = "libcmpiCppImpl0 sblim-cmpi-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/sblim-cmpi-devel-2.0.3-33.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libcmpiCppImpl0 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libcmpiCppImpl0-2.0.3-33.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libcmpiCppImpl0}"
RDEPENDS:libcmpiCppImpl0 = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_sblim-cmpi-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/sblim-cmpi-devel-2.0.3-33.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_sblim-cmpi-devel}"
RDEPENDS:sblim-cmpi-devel = ""
