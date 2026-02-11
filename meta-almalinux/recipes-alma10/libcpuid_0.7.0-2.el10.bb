
PN = "libcpuid"
PE = "0"
PV = "0.7.0"
PR = "2.el10"
PACKAGES = "libcpuid python3-libcpuid libcpuid-devel"


URI_libcpuid = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libcpuid-0.7.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcpuid = " \
 glibc \
"

URI_python3-libcpuid = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-libcpuid-0.7.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-libcpuid = " \
 glibc \
 python3-cffi \
 python3 \
 libcpuid \
"

URI_libcpuid-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libcpuid-devel-0.7.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcpuid-devel = " \
 glibc \
 pkgconf-pkg-config \
 libcpuid \
"
