
PN = "rpmlint"
PE = "0"
PV = "2.5.0"
PR = "6.el10"
PACKAGES = "rpmlint"


URI_rpmlint = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rpmlint-2.5.0-6.el10.noarch.rpm;unpack=0"
RDEPENDS:rpmlint = "/usr/bin/python3 ( ) python3.12dist(packaging) ( ) /usr/bin/appstream-util ( ) /usr/bin/desktop-file-validate ( ) python3.12dist(rpm) ( ) python3.12dist(tomli-w) ( ) python3.12dist(zstandard) ( ) python3.12dist(file-magic) ( ) python3.12dist(pyenchant) ( ) python3.12dist(pyxdg) ( ) rpm-build ( ) python(abi) ( =  3.12)"
RPROVIDES:rpmlint = "python3.12dist(rpmlint) ( =  2.5) python3dist(rpmlint) ( =  2.5) rpmlint ( =  2.5.0-6.el10)"
