
inherit dnf-bridge

PN = "cepces"
PE = "0"
PV = "0.3.9"
PR = "2.el10"
PACKAGES = "cepces cepces-certmonger cepces-selinux python3-cepces"


URI_cepces = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cepces-0.3.9-2.el10.noarch.rpm;unpack=0"
RDEPENDS:cepces = " \
 cepces-selinux \
 python3-cepces \
"

URI_cepces-certmonger = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cepces-certmonger-0.3.9-2.el10.noarch.rpm;unpack=0"
RDEPENDS:cepces-certmonger = " \
 python3 \
 certmonger \
 bash \
 cepces \
"

URI_cepces-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/cepces-selinux-0.3.9-2.el10.noarch.rpm;unpack=0"
RDEPENDS:cepces-selinux = " \
 bash \
 selinux-policy-targeted \
 cepces \
"

URI_python3-cepces = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-cepces-0.3.9-2.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-cepces = " \
 python3 \
 python3-requests \
 python3-gssapi \
 python3-cryptography \
 python3-setuptools \
 python3-requests-gssapi \
"
