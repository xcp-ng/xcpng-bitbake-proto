
PN = "iscsi-initiator-utils"
PE = "0"
PV = "6.2.1.9"
PR = "22.gita65a472.el10"
PACKAGES = "iscsi-initiator-utils iscsi-initiator-utils-iscsiuio python3-iscsi-initiator-utils iscsi-initiator-utils-devel"


URI_iscsi-initiator-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/iscsi-initiator-utils-6.2.1.9-22.gita65a472.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:iscsi-initiator-utils = "
 systemd
 systemd-libs
 openssl-libs
 kmod-libs
 libmount
 iscsi-initiator-utils-iscsiuio
 bash
 isns-utils-libs
 glibc
"

URI_iscsi-initiator-utils-iscsiuio = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/iscsi-initiator-utils-iscsiuio-6.2.1.9-22.gita65a472.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:iscsi-initiator-utils-iscsiuio = "
 systemd-libs
 libgcc
 iscsi-initiator-utils
 bash
 glibc
"

URI_python3-iscsi-initiator-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-iscsi-initiator-utils-6.2.1.9-22.gita65a472.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-iscsi-initiator-utils = "
 glibc
 iscsi-initiator-utils
 python3
"

URI_iscsi-initiator-utils-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/iscsi-initiator-utils-devel-6.2.1.9-22.gita65a472.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:iscsi-initiator-utils-devel = "
 iscsi-initiator-utils
 pkgconf-pkg-config
"
