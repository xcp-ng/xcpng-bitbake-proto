
inherit dnf-bridge

PN = "foomatic-db"
PE = "0"
PV = "4.0"
PR = "83.20230810.el10"
PACKAGES = "foomatic-db foomatic-db-filesystem foomatic-db-ppds"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/foomatic-db-4.0-83.20230810.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_foomatic-db = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/foomatic-db-4.0-83.20230810.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_foomatic-db}"
RDEPENDS:foomatic-db = " \
 foomatic-db-filesystem \
 foomatic-db-ppds \
"

URI_foomatic-db-filesystem = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/foomatic-db-filesystem-4.0-83.20230810.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_foomatic-db-filesystem}"
RDEPENDS:foomatic-db-filesystem = ""

URI_foomatic-db-ppds = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/foomatic-db-ppds-4.0-83.20230810.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_foomatic-db-ppds}"
RDEPENDS:foomatic-db-ppds = " \
 cups \
 sed \
 foomatic-db-filesystem \
"
