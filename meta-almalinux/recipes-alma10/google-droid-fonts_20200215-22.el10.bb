
PN = "google-droid-fonts"
PE = "0"
PV = "20200215"
PR = "22.el10"
PACKAGES = "google-droid-sans-fonts google-droid-sans-mono-fonts google-droid-serif-fonts google-droid-fonts-all"


URI_google-droid-sans-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/google-droid-sans-fonts-20200215-22.el10.noarch.rpm;unpack=0"
RDEPENDS:google-droid-sans-fonts = " \
 fonts-filesystem \
"

URI_google-droid-sans-mono-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/google-droid-sans-mono-fonts-20200215-22.el10.noarch.rpm;unpack=0"
RDEPENDS:google-droid-sans-mono-fonts = " \
 fonts-filesystem \
"

URI_google-droid-serif-fonts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/google-droid-serif-fonts-20200215-22.el10.noarch.rpm;unpack=0"
RDEPENDS:google-droid-serif-fonts = " \
 fonts-filesystem \
"

URI_google-droid-fonts-all = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/google-droid-fonts-all-20200215-22.el10.noarch.rpm;unpack=0"
RDEPENDS:google-droid-fonts-all = " \
 google-droid-sans-fonts \
 google-droid-sans-mono-fonts \
 google-droid-serif-fonts \
"
