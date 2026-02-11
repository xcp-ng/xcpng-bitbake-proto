
PN = "langtable"
PE = "0"
PV = "0.0.65"
PR = "4.el10"
PACKAGES = "langtable python3-langtable"


URI_langtable = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/langtable-0.0.65-4.el10.noarch.rpm;unpack=0"
RDEPENDS:langtable = ""

URI_python3-langtable = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-langtable-0.0.65-4.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-langtable = "
 python3
 langtable
"
