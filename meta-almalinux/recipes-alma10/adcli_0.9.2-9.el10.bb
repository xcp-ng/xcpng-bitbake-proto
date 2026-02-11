
inherit dnf-bridge

PN = "adcli"
PE = "0"
PV = "0.9.2"
PR = "9.el10"
PACKAGES = "adcli adcli-doc"


URI_adcli = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/adcli-0.9.2-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:adcli = " \
 glibc \
 krb5-libs \
 cyrus-sasl-gssapi \
 openldap \
"

URI_adcli-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/adcli-doc-0.9.2-9.el10.noarch.rpm;unpack=0"
RDEPENDS:adcli-doc = ""
