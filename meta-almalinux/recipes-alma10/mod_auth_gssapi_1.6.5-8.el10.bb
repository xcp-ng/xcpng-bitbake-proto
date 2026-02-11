
inherit dnf-bridge

PN = "mod_auth_gssapi"
PE = "0"
PV = "1.6.5"
PR = "8.el10"
PACKAGES = "mod_auth_gssapi"


URI_mod_auth_gssapi = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mod_auth_gssapi-1.6.5-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mod_auth_gssapi = " \
 httpd-core \
 openssl-libs \
 krb5-libs \
 libcom_err \
 glibc \
"
