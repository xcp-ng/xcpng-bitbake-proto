
PN = "filesystem"
PE = "0"
PV = "3.18"
PR = "16.el10"
PACKAGES = "filesystem filesystem-content"


URI_filesystem = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/filesystem-3.18-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:filesystem = "setup ( )"
RPROVIDES:filesystem = "filesystem ( =  3.18-16.el10) filesystem(x86-64) ( =  3.18-16.el10) filesystem-afs ( =  3.18-16.el10)"

URI_filesystem-content = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/filesystem-content-3.18-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:filesystem-content = ""
RPROVIDES:filesystem-content = "filesystem-content ( =  3.18-16.el10) filesystem-content(x86-64) ( =  3.18-16.el10)"
