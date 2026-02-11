
PN = "fetchmail"
PE = "0"
PV = "6.4.38"
PR = "3.el10"
PACKAGES = "fetchmail"


URI_fetchmail = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/fetchmail-6.4.38-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fetchmail = "
 glibc
 krb5-libs
 openssl-libs
 libcom_err
"
