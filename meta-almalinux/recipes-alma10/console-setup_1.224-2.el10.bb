
PN = "console-setup"
PE = "0"
PV = "1.224"
PR = "2.el10"
PACKAGES = "bdf2psf console-setup"


URI_bdf2psf = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/bdf2psf-1.224-2.el10.noarch.rpm;unpack=0"
RDEPENDS:bdf2psf = " \
 perl-interpreter \
 perl-libs \
"

URI_console-setup = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/console-setup-1.224-2.el10.noarch.rpm;unpack=0"
RDEPENDS:console-setup = " \
 perl-interpreter \
 perl-libs \
 kbd \
 bash \
"
