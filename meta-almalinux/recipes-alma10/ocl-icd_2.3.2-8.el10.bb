
inherit dnf-bridge

PN = "ocl-icd"
PE = "0"
PV = "2.3.2"
PR = "8.el10"
PACKAGES = "ocl-icd ocl-icd-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/ocl-icd-2.3.2-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_ocl-icd = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ocl-icd-2.3.2-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ocl-icd}"
RDEPENDS:ocl-icd = " \
 glibc \
"

URI_ocl-icd-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ocl-icd-devel-2.3.2-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_ocl-icd-devel}"
RDEPENDS:ocl-icd-devel = " \
 glibc \
 ocl-icd \
 pkgconf-pkg-config \
 opencl-headers \
"
