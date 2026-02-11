
inherit dnf-bridge

PN = "python-dns"
PE = "0"
PV = "2.6.1"
PR = "1.el10"
PACKAGES = "python3-dns python3-dns+dnssec python3-dns+idna"


URI_python3-dns = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-dns-2.6.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-dns = " \
 python3 \
"

URI_python3-dns+dnssec = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-dns+dnssec-2.6.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-dns+dnssec = " \
 python3 \
 python3-dns \
 python3-cryptography \
"

URI_python3-dns+idna = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-dns+idna-2.6.1-1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-dns+idna = " \
 python3 \
 python3-idna \
 python3-dns \
"
