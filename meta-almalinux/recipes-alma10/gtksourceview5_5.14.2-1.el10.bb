
PN = "gtksourceview5"
PE = "0"
PV = "5.14.2"
PR = "1.el10"
PACKAGES = "gtksourceview5 gtksourceview5-devel gtksourceview5-tests"


URI_gtksourceview5 = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/gtksourceview5-5.14.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtksourceview5 = " \
 fribidi \
 libxml2 \
 pango \
 gdk-pixbuf2 \
 fontconfig \
 pcre2 \
 cairo \
 glib2 \
 glibc \
 gtk4 \
 hicolor-icon-theme \
"

URI_gtksourceview5-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/gtksourceview5-devel-5.14.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtksourceview5-devel = " \
 libxml2-devel \
 sysprof-capture-devel \
 glib2-devel \
 fribidi-devel \
 pkgconf-pkg-config \
 pango-devel \
 fontconfig-devel \
 pcre2-devel \
 gtk4-devel \
 gtksourceview5 \
"

URI_gtksourceview5-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/gtksourceview5-tests-5.14.2-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:gtksourceview5-tests = " \
 fribidi \
 libxml2 \
 pango \
 gdk-pixbuf2 \
 fontconfig \
 pcre2 \
 cairo \
 glib2 \
 glibc \
 gtk4 \
 gtksourceview5 \
"
