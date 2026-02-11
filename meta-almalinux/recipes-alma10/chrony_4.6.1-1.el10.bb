
PN = "chrony"
PE = "0"
PV = "4.6.1"
PR = "1.el10"
PACKAGES = "chrony"


URI_chrony = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/chrony-4.6.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:chrony = "
 tzdata
 shadow-utils
 systemd
 gnutls
 libcap
 bash
 libseccomp
 glibc
 libedit
"
