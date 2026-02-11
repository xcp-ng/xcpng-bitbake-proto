
inherit dnf-bridge

PN = "fio"
PE = "0"
PV = "3.36"
PR = "5.el10"
PACKAGES = "fio fio-engine-http fio-engine-libaio fio-engine-nbd fio-engine-rados fio-engine-rbd fio-engine-rdma"


URI_fio = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fio-3.36-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fio = " \
 python3 \
 zlib-ng-compat \
 numactl-libs \
 bash \
 glibc \
"

URI_fio-engine-http = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fio-engine-http-3.36-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fio-engine-http = " \
 glibc \
 fio \
 openssl-libs \
 libcurl \
"

URI_fio-engine-libaio = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fio-engine-libaio-3.36-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fio-engine-libaio = " \
 glibc \
 fio \
 libaio \
"

URI_fio-engine-nbd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fio-engine-nbd-3.36-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fio-engine-nbd = " \
 glibc \
 fio \
 libnbd \
"

URI_fio-engine-rados = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fio-engine-rados-3.36-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fio-engine-rados = " \
 glibc \
 fio \
 librados2 \
"

URI_fio-engine-rbd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fio-engine-rbd-3.36-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fio-engine-rbd = " \
 glibc \
 fio \
 librados2 \
 librbd1 \
"

URI_fio-engine-rdma = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fio-engine-rdma-3.36-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fio-engine-rdma = " \
 glibc \
 fio \
 libibverbs \
 librdmacm \
"
