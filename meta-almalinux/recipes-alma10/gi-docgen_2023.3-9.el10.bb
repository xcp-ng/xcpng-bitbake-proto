
PN = "gi-docgen"
PE = "0"
PV = "2023.3"
PR = "9.el10"
PACKAGES = "gi-docgen gi-docgen-doc gi-docgen-fonts"


URI_gi-docgen = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gi-docgen-2023.3-9.el10.noarch.rpm;unpack=0"
RDEPENDS:gi-docgen = " \
 python3 \
 python3-typogrify \
 pkgconf-pkg-config \
 python3-pygments \
 python3-markdown \
 python3-jinja2 \
 gi-docgen-fonts \
 python3-markupsafe \
 python3-packaging \
"

URI_gi-docgen-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gi-docgen-doc-2023.3-9.el10.noarch.rpm;unpack=0"
RDEPENDS:gi-docgen-doc = ""

URI_gi-docgen-fonts = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gi-docgen-fonts-2023.3-9.el10.noarch.rpm;unpack=0"
RDEPENDS:gi-docgen-fonts = " \
 redhat-text-fonts \
 redhat-display-fonts \
 redhat-mono-vf-fonts \
"
