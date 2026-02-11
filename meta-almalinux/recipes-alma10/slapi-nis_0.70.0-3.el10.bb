
PN = "slapi-nis"
PE = "0"
PV = "0.70.0"
PR = "3.el10"
PACKAGES = "slapi-nis"


URI_slapi-nis = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/slapi-nis-0.70.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:slapi-nis = "
 nss
 pam-libs
 libsss_nss_idmap
 389-ds-base
 nss-util
 bash
 glibc
 openldap
 nspr
"
