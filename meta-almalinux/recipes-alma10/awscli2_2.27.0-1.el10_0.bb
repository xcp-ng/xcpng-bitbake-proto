
PN = "awscli2"
PE = "0"
PV = "2.27.0"
PR = "1.el10_0"
PACKAGES = "awscli2"


URI_awscli2 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/awscli2-2.27.0-1.el10_0.noarch.rpm;unpack=0"
RDEPENDS:awscli2 = "
 python3
 python3-ruamel-yaml
 python3-ruamel-yaml-clib
 python3-prompt-toolkit
 python3-urllib3
 python3-awscrt
 python3-cryptography
 python3-dateutil
 python3-colorama
 python3-jmespath
 python3-distro
 python3-docutils
"
