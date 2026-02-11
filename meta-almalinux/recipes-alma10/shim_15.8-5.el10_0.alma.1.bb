
PN = "shim"
PE = "0"
PV = "15.8"
PR = "5.el10_0.alma.1"
PACKAGES = "shim-x64"


URI_shim-x64 = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/shim-x64-15.8-5.el10_0.alma.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:shim-x64 = "efi-filesystem ( ) dbxtool ( >=  0.6-3) mokutil ( >=  1:0.3.0-1)"
RPROVIDES:shim-x64 = "bundled(openssl) ( =  1.0.2j) shim ( =  15.8-5.el10_0.alma.1) shim-signed ( =  15.8-5.el10_0.alma.1) shim-signed-x64 ( =  15.8-5.el10_0.alma.1) shim-x64 ( =  15.8-5.el10_0.alma.1) shim-x64(x86-64) ( =  15.8-5.el10_0.alma.1)"
