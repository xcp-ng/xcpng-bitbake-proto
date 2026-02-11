
PN = "mod_authnz_pam"
PE = "0"
PV = "1.2.3"
PR = "9.el10"
PACKAGES = "mod_authnz_pam"


URI_mod_authnz_pam = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mod_authnz_pam-1.2.3-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mod_authnz_pam = " \
 glibc \
 pam-libs \
 httpd-core \
 pam \
"
