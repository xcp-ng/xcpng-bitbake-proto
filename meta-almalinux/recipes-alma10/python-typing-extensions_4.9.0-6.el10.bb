
inherit dnf-bridge

PN = "python-typing-extensions"
PE = "0"
PV = "4.9.0"
PR = "6.el10"
PACKAGES = "python3-typing-extensions"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/python-typing-extensions-4.9.0-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_python3-typing-extensions = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-typing-extensions-4.9.0-6.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_python3-typing-extensions}"
RDEPENDS:python3-typing-extensions = " \
 python3 \
"
