
inherit dnf-bridge

PN = "python-prompt-toolkit"
PE = "0"
PV = "3.0.41"
PR = "5.el10"
PACKAGES = "python3-prompt-toolkit"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/python-prompt-toolkit-3.0.41-5.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-prompt-toolkit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-prompt-toolkit-3.0.41-5.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-prompt-toolkit}"
RDEPENDS:python3-prompt-toolkit = " \
 python3 \
 python3-wcwidth \
"
