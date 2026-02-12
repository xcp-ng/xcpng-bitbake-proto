
inherit dnf-bridge

PN = "mobile-broadband-provider-info"
PE = "0"
PV = "20230416"
PR = "7.el10"
PACKAGES = "mobile-broadband-provider-info mobile-broadband-provider-info-devel"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/mobile-broadband-provider-info-20230416-7.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mobile-broadband-provider-info = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mobile-broadband-provider-info-20230416-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_mobile-broadband-provider-info}"
RDEPENDS:mobile-broadband-provider-info = ""

URI_mobile-broadband-provider-info-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/mobile-broadband-provider-info-devel-20230416-7.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_mobile-broadband-provider-info-devel}"
RDEPENDS:mobile-broadband-provider-info-devel = " \
 mobile-broadband-provider-info \
 pkgconf-pkg-config \
"
