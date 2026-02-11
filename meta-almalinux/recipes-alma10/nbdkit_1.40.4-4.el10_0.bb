
inherit dnf-bridge

PN = "nbdkit"
PE = "0"
PV = "1.40.4"
PR = "4.el10_0"
PACKAGES = "nbdkit nbdkit-bash-completion nbdkit-basic-filters nbdkit-basic-plugins nbdkit-curl-plugin nbdkit-linuxdisk-plugin nbdkit-nbd-plugin nbdkit-python-plugin nbdkit-selinux nbdkit-server nbdkit-ssh-plugin nbdkit-tar-filter nbdkit-tmpdisk-plugin nbdkit-vddk-plugin nbdkit-xz-filter nbdkit-devel nbdkit-example-plugins nbdkit-srpm-macros nbdkit-blkio-plugin nbdkit-bzip2-filter nbdkit-stats-filter"


URI_nbdkit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit = " \
 nbdkit-basic-plugins \
 nbdkit-selinux \
 nbdkit-server \
 nbdkit-basic-filters \
"

URI_nbdkit-bash-completion = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-bash-completion-1.40.4-4.el10_0.noarch.rpm;unpack=0"
RDEPENDS:nbdkit-bash-completion = " \
 nbdkit-server \
 bash-completion \
"

URI_nbdkit-basic-filters = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-basic-filters-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-basic-filters = " \
 zlib-ng-compat \
 gnutls \
 libgcc \
 nbdkit-server \
 glibc \
"

URI_nbdkit-basic-plugins = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-basic-plugins-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-basic-plugins = " \
 gnutls \
 libgcc \
 libzstd \
 nbdkit-server \
 glibc \
"

URI_nbdkit-curl-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-curl-plugin-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-curl-plugin = " \
 glibc \
 libgcc \
 nbdkit-server \
 libcurl \
"

URI_nbdkit-linuxdisk-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-linuxdisk-plugin-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-linuxdisk-plugin = " \
 glibc \
 e2fsprogs \
 libgcc \
 nbdkit-server \
"

URI_nbdkit-nbd-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-nbd-plugin-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-nbd-plugin = " \
 glibc \
 libgcc \
 nbdkit-server \
 libnbd \
"

URI_nbdkit-python-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-python-plugin-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-python-plugin = " \
 glibc \
 libgcc \
 nbdkit-server \
 python3-libs \
"

URI_nbdkit-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-selinux-1.40.4-4.el10_0.noarch.rpm;unpack=0"
RDEPENDS:nbdkit-selinux = " \
 policycoreutils-python-utils \
 policycoreutils \
 bash \
 selinux-policy \
 libselinux-utils \
 selinux-policy-targeted \
"

URI_nbdkit-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-server-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-server = " \
 glibc \
 libselinux \
 libgcc \
 gnutls \
"

URI_nbdkit-ssh-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-ssh-plugin-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-ssh-plugin = " \
 glibc \
 libgcc \
 nbdkit-server \
 libssh \
"

URI_nbdkit-tar-filter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-tar-filter-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-tar-filter = " \
 glibc \
 libgcc \
 tar \
 nbdkit-server \
"

URI_nbdkit-tmpdisk-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-tmpdisk-plugin-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-tmpdisk-plugin = " \
 e2fsprogs \
 util-linux \
 libgcc \
 nbdkit-server \
 glibc \
"

URI_nbdkit-vddk-plugin = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-vddk-plugin-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-vddk-plugin = " \
 glibc \
 libxcrypt-compat \
 libgcc \
 nbdkit-server \
"

URI_nbdkit-xz-filter = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nbdkit-xz-filter-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-xz-filter = " \
 glibc \
 libgcc \
 nbdkit-server \
 xz-libs \
"

URI_nbdkit-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/nbdkit-devel-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-devel = " \
 nbdkit-server \
 pkgconf-pkg-config \
"

URI_nbdkit-example-plugins = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/nbdkit-example-plugins-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-example-plugins = " \
 glibc \
 nbdkit-server \
"

URI_nbdkit-srpm-macros = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/nbdkit-srpm-macros-1.40.4-4.el10_0.noarch.rpm;unpack=0"
RDEPENDS:nbdkit-srpm-macros = " \
 bash \
"

URI_nbdkit-blkio-plugin = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/nbdkit-blkio-plugin-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-blkio-plugin = " \
 glibc \
 libblkio \
 nbdkit-server \
"

URI_nbdkit-bzip2-filter = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/nbdkit-bzip2-filter-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-bzip2-filter = " \
 glibc \
 libgcc \
 nbdkit-server \
 bzip2-libs \
"

URI_nbdkit-stats-filter = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/nbdkit-stats-filter-1.40.4-4.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:nbdkit-stats-filter = " \
 glibc \
 libgcc \
 nbdkit-server \
 libstdc++ \
"
