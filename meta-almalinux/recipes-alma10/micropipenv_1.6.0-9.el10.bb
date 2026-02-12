
inherit dnf-bridge

PN = "micropipenv"
PE = "0"
PV = "1.6.0"
PR = "9.el10"
PACKAGES = "micropipenv micropipenv+toml"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/micropipenv-1.6.0-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_micropipenv = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/micropipenv-1.6.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_micropipenv}"
RDEPENDS:micropipenv = " \
 python3 \
 python3-pip \
"

URI_micropipenv+toml = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/micropipenv+toml-1.6.0-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_micropipenv+toml}"
RDEPENDS:micropipenv+toml = " \
 python3 \
 micropipenv \
"
