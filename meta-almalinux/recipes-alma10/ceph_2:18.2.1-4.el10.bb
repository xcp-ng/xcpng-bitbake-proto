
PN = "ceph"
PE = "2"
PV = "18.2.1"
PR = "4.el10"
PACKAGES = "librados2 librbd1 librados-devel libradospp-devel librbd-devel ceph ceph-common libcephfs-devel libcephfs2 libcephsqlite libcephsqlite-devel libradosstriper-devel libradosstriper1 python3-ceph-argparse python3-ceph-common python3-cephfs python3-rados python3-rbd rados-objclass-devel"


URI_librados2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/librados2-18.2.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librados2 = " \
 zlib-ng-compat \
 systemd-libs \
 openssl-libs \
 libgcc \
 libblkid \
 librdmacm \
 libstdc++ \
 libibverbs \
 glibc \
"

URI_librbd1 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/librbd1-18.2.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librbd1 = " \
 librados2 \
 cryptsetup-libs \
 openssl-libs \
 libgcc \
 libstdc++ \
 glibc \
"

URI_librados-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/librados-devel-18.2.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librados-devel = " \
 glibc \
 libgcc \
 librados2 \
 libstdc++ \
"

URI_libradospp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libradospp-devel-18.2.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libradospp-devel = " \
 librados-devel \
 librados2 \
"

URI_librbd-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/librbd-devel-18.2.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:librbd-devel = " \
 librados-devel \
 libradospp-devel \
 librbd1 \
"

URI_ceph = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ceph-18.2.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ceph = " \
 systemd \
 binutils \
"

URI_ceph-common = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/ceph-common-18.2.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ceph-common = " \
 python3 \
 systemd \
 systemd-libs \
 keyutils-libs \
 ncurses-libs \
 python3-ceph-argparse \
 python3-ceph-common \
 libradosstriper1 \
 libcephfs2 \
 python3-cephfs \
 libblkid \
 libcap-ng \
 libstdc++ \
 python3-rados \
 python3-rbd \
 librados2 \
 librbd1 \
 libgcc \
 bash \
 python3-prettytable \
 lua-libs \
 glibc \
"

URI_libcephfs-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libcephfs-devel-18.2.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcephfs-devel = " \
 libcephfs2 \
 librados-devel \
"

URI_libcephfs2 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libcephfs2-18.2.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcephfs2 = " \
 glibc \
 libgcc \
 librados2 \
 libstdc++ \
"

URI_libcephsqlite = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libcephsqlite-18.2.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcephsqlite = " \
 glibc \
 libgcc \
 librados2 \
 libstdc++ \
"

URI_libcephsqlite-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libcephsqlite-devel-18.2.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libcephsqlite-devel = " \
 libcephsqlite \
 librados-devel \
 libradospp-devel \
 sqlite-devel \
"

URI_libradosstriper-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libradosstriper-devel-18.2.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libradosstriper-devel = " \
 libradosstriper1 \
 librados-devel \
 libradospp-devel \
"

URI_libradosstriper1 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/libradosstriper1-18.2.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libradosstriper1 = " \
 glibc \
 libgcc \
 librados2 \
 libstdc++ \
"

URI_python3-ceph-argparse = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-ceph-argparse-18.2.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-ceph-argparse = " \
 python3 \
"

URI_python3-ceph-common = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-ceph-common-18.2.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-ceph-common = " \
 python3 \
 python3-pyyaml \
"

URI_python3-cephfs = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-cephfs-18.2.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-cephfs = " \
 python3 \
 python3-rados \
 python3-ceph-argparse \
 glibc \
 libcephfs2 \
"

URI_python3-rados = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-rados-18.2.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-rados = " \
 glibc \
 librados2 \
 python3 \
"

URI_python3-rbd = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-rbd-18.2.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-rbd = " \
 python3 \
 python3-rados \
 librados2 \
 librbd1 \
 glibc \
"

URI_rados-objclass-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rados-objclass-devel-18.2.1-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rados-objclass-devel = " \
 libradospp-devel \
"
