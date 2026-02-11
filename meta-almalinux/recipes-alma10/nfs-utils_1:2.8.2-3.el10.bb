
inherit dnf-bridge

PN = "nfs-utils"
PE = "1"
PV = "2.8.2"
PR = "3.el10"
PACKAGES = "libnfsidmap nfs-utils nfs-utils-coreos nfsv4-client-utils libnfsidmap-devel nfs-stats-utils"


URI_libnfsidmap = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libnfsidmap-2.8.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnfsidmap = " \
 glibc \
 krb5-libs \
 openldap \
"

URI_nfs-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/nfs-utils-2.8.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nfs-utils = " \
 python3 \
 systemd \
 keyutils \
 keyutils-libs \
 kmod \
 krb5-libs \
 device-mapper-libs \
 util-linux \
 libblkid \
 libcap \
 libcom_err \
 sed \
 libtirpc \
 libuuid \
 shadow-utils \
 libevent \
 libgcc \
 grep \
 libxml2 \
 sqlite-libs \
 bash \
 glibc \
 quota \
 gssproxy \
 gawk \
 readline \
 libmount \
 libnfsidmap \
 libnl3 \
 coreutils \
 rpcbind \
"

URI_nfs-utils-coreos = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nfs-utils-coreos-2.8.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nfs-utils-coreos = " \
 systemd \
 libevent \
 keyutils-libs \
 libgcc \
 libmount \
 libcap \
 krb5-libs \
 libcom_err \
 bash \
 libnfsidmap \
 glibc \
 libtirpc \
 rpcbind \
"

URI_nfsv4-client-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/nfsv4-client-utils-2.8.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nfsv4-client-utils = " \
 libevent \
 keyutils-libs \
 gssproxy \
 libgcc \
 libmount \
 krb5-libs \
 libcom_err \
 libnfsidmap \
 glibc \
 libtirpc \
"

URI_libnfsidmap-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libnfsidmap-devel-2.8.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libnfsidmap-devel = " \
 libnfsidmap \
 pkgconf-pkg-config \
"

URI_nfs-stats-utils = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/nfs-stats-utils-2.8.2-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:nfs-stats-utils = " \
 python3 \
"
