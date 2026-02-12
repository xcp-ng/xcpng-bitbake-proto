
inherit dnf-bridge

PN = "evolution-data-server"
PE = "0"
PV = "3.52.4"
PR = "3.el10"
PACKAGES = "evolution-data-server evolution-data-server-langpacks evolution-data-server-perl evolution-data-server-devel evolution-data-server-doc evolution-data-server-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/evolution-data-server-3.52.4-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_evolution-data-server = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/evolution-data-server-3.52.4-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_evolution-data-server}"
RDEPENDS:evolution-data-server = " \
 nss \
 pango \
 libcanberra \
 libcanberra-gtk3 \
 krb5-libs \
 evolution-data-server-langpacks \
 json-glib \
 libstdc++ \
 cairo \
 gnome-online-accounts \
 openldap \
 zlib-ng-compat \
 libgcc \
 libxml2 \
 sqlite-libs \
 libsecret \
 libicu \
 libgweather \
 libsoup3 \
 libical \
 libical-glib \
 glib2 \
 gtk3 \
 glibc \
 gtk4 \
 nspr \
"

URI_evolution-data-server-langpacks = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/evolution-data-server-langpacks-3.52.4-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_evolution-data-server-langpacks}"
RDEPENDS:evolution-data-server-langpacks = " \
 evolution-data-server \
"

URI_evolution-data-server-perl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/evolution-data-server-perl-3.52.4-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_evolution-data-server-perl}"
RDEPENDS:evolution-data-server-perl = " \
 evolution-data-server \
 perl-interpreter \
"

URI_evolution-data-server-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/evolution-data-server-devel-3.52.4-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_evolution-data-server-devel}"
RDEPENDS:evolution-data-server-devel = " \
 libxml2-devel \
 json-glib-devel \
 glib2-devel \
 evolution-data-server-devel \
 libsoup3-devel \
 evolution-data-server \
 pkgconf-pkg-config \
 gnome-online-accounts-devel \
 libsecret-devel \
 libgweather-devel \
 gtk3-devel \
 libical-glib-devel \
 gtk4-devel \
 sqlite-devel \
"

URI_evolution-data-server-doc = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/evolution-data-server-doc-3.52.4-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_evolution-data-server-doc}"
RDEPENDS:evolution-data-server-doc = ""

URI_evolution-data-server-tests = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/evolution-data-server-tests-3.52.4-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_evolution-data-server-tests}"
RDEPENDS:evolution-data-server-tests = " \
 glibc \
 evolution-data-server \
 libical-glib \
 glib2 \
"
