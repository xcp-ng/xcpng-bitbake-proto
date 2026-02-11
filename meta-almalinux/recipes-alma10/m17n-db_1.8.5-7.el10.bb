
PN = "m17n-db"
PE = "0"
PV = "1.8.5"
PR = "7.el10"
PACKAGES = "m17n-db m17n-db-devel m17n-db-extras"


URI_m17n-db = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/m17n-db-1.8.5-7.el10.noarch.rpm;unpack=0"
RDEPENDS:m17n-db = "/usr/bin/gawk ( )"
RPROVIDES:m17n-db = "m17n-contrib ( =  1.1.14-4.fc20) m17n-db ( =  1.8.5-7.el10)"

URI_m17n-db-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/m17n-db-devel-1.8.5-7.el10.noarch.rpm;unpack=0"
RDEPENDS:m17n-db-devel = "/usr/bin/sh ( ) /usr/bin/pkg-config ( ) m17n-db ( =  1.8.5-7.el10)"
RPROVIDES:m17n-db-devel = "m17n-db-devel ( =  1.8.5-7.el10) pkgconfig(m17n-db) ( =  1.8.5)"

URI_m17n-db-extras = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/m17n-db-extras-1.8.5-7.el10.noarch.rpm;unpack=0"
RDEPENDS:m17n-db-extras = "m17n-db ( =  1.8.5-7.el10)"
RPROVIDES:m17n-db-extras = "m17n-contrib-extras ( =  1.1.14-4.fc20) m17n-db-extras ( =  1.8.5-7.el10)"
