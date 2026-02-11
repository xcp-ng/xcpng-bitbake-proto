
PN = "harfbuzz"
PE = "0"
PV = "8.4.0"
PR = "6.el10"
PACKAGES = "harfbuzz harfbuzz-cairo harfbuzz-devel harfbuzz-icu"


URI_harfbuzz = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/harfbuzz-8.4.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:harfbuzz = " \
 glibc \
 freetype \
 graphite2 \
 glib2 \
"

URI_harfbuzz-cairo = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/harfbuzz-cairo-8.4.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:harfbuzz-cairo = " \
 glibc \
 harfbuzz \
 cairo \
"

URI_harfbuzz-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/harfbuzz-devel-8.4.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:harfbuzz-devel = " \
 freetype \
 glib2-devel \
 freetype-devel \
 harfbuzz \
 libicu-devel \
 pkgconf-pkg-config \
 graphite2-devel \
 harfbuzz-icu \
 cairo \
 glib2 \
 harfbuzz-cairo \
 glibc \
 cairo-devel \
"

URI_harfbuzz-icu = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/harfbuzz-icu-8.4.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:harfbuzz-icu = " \
 glibc \
 libicu \
 harfbuzz \
"
