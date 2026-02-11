
PN = "iso-codes"
PE = "0"
PV = "4.16.0"
PR = "6.el10"
PACKAGES = "iso-codes iso-codes-devel"


URI_iso-codes = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/iso-codes-4.16.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:iso-codes = "xml-common ( )"
RPROVIDES:iso-codes = "iso-codes ( =  4.16.0-6.el10)"

URI_iso-codes-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/iso-codes-devel-4.16.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:iso-codes-devel = "/usr/bin/pkg-config ( ) iso-codes ( =  4.16.0-6.el10)"
RPROVIDES:iso-codes-devel = "iso-codes-devel ( =  4.16.0-6.el10) pkgconfig(iso-codes) ( =  4.16.0)"
