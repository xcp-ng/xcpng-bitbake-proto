
inherit dnf-bridge

PN = "mod_intercept_form_submit"
PE = "0"
PV = "1.2.0"
PR = "8.el10"
PACKAGES = "mod_intercept_form_submit"


URI_mod_intercept_form_submit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mod_intercept_form_submit-1.2.0-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mod_intercept_form_submit = " \
 glibc \
 mod_authnz_pam \
 httpd-core \
"
