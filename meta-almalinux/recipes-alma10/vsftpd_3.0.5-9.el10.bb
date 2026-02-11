
PN = "vsftpd"
PE = "0"
PV = "3.0.5"
PR = "9.el10"
PACKAGES = "vsftpd"


URI_vsftpd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/vsftpd-3.0.5-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:vsftpd = " \
 logrotate \
 openssl-libs \
 libcap \
 pam-libs \
 bash \
 glibc \
"
