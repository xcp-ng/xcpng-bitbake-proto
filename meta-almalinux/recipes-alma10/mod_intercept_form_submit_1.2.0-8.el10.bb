
inherit dnf-bridge

PN = "mod_intercept_form_submit"
PE = "0"
PV = "1.2.0"
PR = "8.el10"
PACKAGES = "mod_intercept_form_submit"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/mod_intercept_form_submit-1.2.0-8.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mod_intercept_form_submit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mod_intercept_form_submit-1.2.0-8.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mod_intercept_form_submit}"
RDEPENDS:mod_intercept_form_submit = " \
 glibc \
 mod_authnz_pam \
 httpd-core \
"
