
inherit dnf-bridge

PN = "python-tpm2-pytss"
PE = "0"
PV = "2.3.0"
PR = "2.el10"
PACKAGES = "python3-tpm2-pytss"


URI_python3-tpm2-pytss = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-tpm2-pytss-2.3.0-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-tpm2-pytss = " \
 python3 \
 python3-pyyaml \
 python3-cffi \
 python3-cryptography \
 tpm2-tss \
 glibc \
 python3-packaging \
 python3-asn1crypto \
 tpm2-tss-fapi \
"
