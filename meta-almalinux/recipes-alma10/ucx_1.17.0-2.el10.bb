
PN = "ucx"
PE = "0"
PV = "1.17.0"
PR = "2.el10"
PACKAGES = "ucx ucx-cma ucx-devel ucx-ib ucx-rdmacm"


URI_ucx = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ucx-1.17.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ucx = " \
 glibc \
 libgcc \
 libstdc++ \
 libgomp \
"

URI_ucx-cma = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ucx-cma-1.17.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ucx-cma = " \
 glibc \
 ucx \
"

URI_ucx-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ucx-devel-1.17.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ucx-devel = " \
 ucx \
 pkgconf-pkg-config \
 ucx-devel \
 rdma-core-devel \
"

URI_ucx-ib = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ucx-ib-1.17.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ucx-ib = " \
 glibc \
 ucx \
 libibverbs \
"

URI_ucx-rdmacm = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ucx-rdmacm-1.17.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ucx-rdmacm = " \
 librdmacm \
 ucx \
 libibverbs \
 ucx-ib \
 glibc \
"
