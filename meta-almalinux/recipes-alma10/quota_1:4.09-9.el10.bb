
inherit dnf-bridge

PN = "quota"
PE = "1"
PV = "4.09"
PR = "9.el10"
PACKAGES = "quota quota-nls quota-doc quota-nld quota-rpc quota-warnquota quota-devel"


URI_quota = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/quota-4.09-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:quota = " \
 glibc \
 libtirpc \
 e2fsprogs-libs \
 quota-nls \
"

URI_quota-nls = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/quota-nls-4.09-9.el10.noarch.rpm;unpack=0"
RDEPENDS:quota-nls = ""

URI_quota-doc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/quota-doc-4.09-9.el10.noarch.rpm;unpack=0"
RDEPENDS:quota-doc = " \
 quota \
"

URI_quota-nld = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/quota-nld-4.09-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:quota-nld = " \
 systemd \
 quota-nls \
 libnl3 \
 bash \
 glibc \
 dbus-libs \
"

URI_quota-rpc = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/quota-rpc-4.09-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:quota-rpc = " \
 systemd \
 quota-nls \
 bash \
 glibc \
 libtirpc \
 rpcbind \
"

URI_quota-warnquota = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/quota-warnquota-4.09-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:quota-warnquota = " \
 glibc \
 libtirpc \
 quota-nls \
 openldap \
"

URI_quota-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/quota-devel-4.09-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:quota-devel = " \
 libtirpc-devel \
"
