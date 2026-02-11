
PN = "ansible-core"
PE = "1"
PV = "2.16.14"
PR = "1.el10"
PACKAGES = "ansible-core ansible-test"


URI_ansible-core = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ansible-core-2.16.14-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ansible-core = " \
 python3 \
 python3-pyyaml \
 git-core \
 python3-cryptography \
 python3-jinja2 \
 python3-packaging \
 python3-resolvelib \
"

URI_ansible-test = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ansible-test-2.16.14-1.el10.noarch.rpm;unpack=0"
RDEPENDS:ansible-test = " \
 python3 \
 ansible-core \
"
