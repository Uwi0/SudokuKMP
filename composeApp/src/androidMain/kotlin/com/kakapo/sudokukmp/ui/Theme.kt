package com.kakapo.sudokukmp.ui

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.kakapo.sudokukmp.designSystem.theme.AppTypography
import com.kakapo.sudokukmp.designSystem.theme.backgroundDark
import com.kakapo.sudokukmp.designSystem.theme.backgroundDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.backgroundDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.backgroundLight
import com.kakapo.sudokukmp.designSystem.theme.backgroundLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.backgroundLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.errorContainerDark
import com.kakapo.sudokukmp.designSystem.theme.errorContainerDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.errorContainerDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.errorContainerLight
import com.kakapo.sudokukmp.designSystem.theme.errorContainerLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.errorContainerLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.errorDark
import com.kakapo.sudokukmp.designSystem.theme.errorDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.errorDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.errorLight
import com.kakapo.sudokukmp.designSystem.theme.errorLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.errorLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.inverseOnSurfaceDark
import com.kakapo.sudokukmp.designSystem.theme.inverseOnSurfaceDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.inverseOnSurfaceDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.inverseOnSurfaceLight
import com.kakapo.sudokukmp.designSystem.theme.inverseOnSurfaceLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.inverseOnSurfaceLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.inversePrimaryDark
import com.kakapo.sudokukmp.designSystem.theme.inversePrimaryDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.inversePrimaryDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.inversePrimaryLight
import com.kakapo.sudokukmp.designSystem.theme.inversePrimaryLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.inversePrimaryLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.inverseSurfaceDark
import com.kakapo.sudokukmp.designSystem.theme.inverseSurfaceDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.inverseSurfaceDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.inverseSurfaceLight
import com.kakapo.sudokukmp.designSystem.theme.inverseSurfaceLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.inverseSurfaceLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.onBackgroundDark
import com.kakapo.sudokukmp.designSystem.theme.onBackgroundDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.onBackgroundDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.onBackgroundLight
import com.kakapo.sudokukmp.designSystem.theme.onBackgroundLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.onBackgroundLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.onErrorContainerDark
import com.kakapo.sudokukmp.designSystem.theme.onErrorContainerDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.onErrorContainerDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.onErrorContainerLight
import com.kakapo.sudokukmp.designSystem.theme.onErrorContainerLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.onErrorContainerLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.onErrorDark
import com.kakapo.sudokukmp.designSystem.theme.onErrorDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.onErrorDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.onErrorLight
import com.kakapo.sudokukmp.designSystem.theme.onErrorLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.onErrorLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.onPrimaryContainerDark
import com.kakapo.sudokukmp.designSystem.theme.onPrimaryContainerDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.onPrimaryContainerDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.onPrimaryContainerLight
import com.kakapo.sudokukmp.designSystem.theme.onPrimaryContainerLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.onPrimaryContainerLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.onPrimaryDark
import com.kakapo.sudokukmp.designSystem.theme.onPrimaryDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.onPrimaryDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.onPrimaryLight
import com.kakapo.sudokukmp.designSystem.theme.onPrimaryLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.onPrimaryLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.onSecondaryContainerDark
import com.kakapo.sudokukmp.designSystem.theme.onSecondaryContainerDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.onSecondaryContainerDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.onSecondaryContainerLight
import com.kakapo.sudokukmp.designSystem.theme.onSecondaryContainerLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.onSecondaryContainerLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.onSecondaryDark
import com.kakapo.sudokukmp.designSystem.theme.onSecondaryDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.onSecondaryDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.onSecondaryLight
import com.kakapo.sudokukmp.designSystem.theme.onSecondaryLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.onSecondaryLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.onSurfaceDark
import com.kakapo.sudokukmp.designSystem.theme.onSurfaceDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.onSurfaceDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.onSurfaceLight
import com.kakapo.sudokukmp.designSystem.theme.onSurfaceLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.onSurfaceLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.onSurfaceVariantDark
import com.kakapo.sudokukmp.designSystem.theme.onSurfaceVariantDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.onSurfaceVariantDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.onSurfaceVariantLight
import com.kakapo.sudokukmp.designSystem.theme.onSurfaceVariantLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.onSurfaceVariantLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.onTertiaryContainerDark
import com.kakapo.sudokukmp.designSystem.theme.onTertiaryContainerDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.onTertiaryContainerDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.onTertiaryContainerLight
import com.kakapo.sudokukmp.designSystem.theme.onTertiaryContainerLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.onTertiaryContainerLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.onTertiaryDark
import com.kakapo.sudokukmp.designSystem.theme.onTertiaryDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.onTertiaryDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.onTertiaryLight
import com.kakapo.sudokukmp.designSystem.theme.onTertiaryLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.onTertiaryLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.outlineDark
import com.kakapo.sudokukmp.designSystem.theme.outlineDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.outlineDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.outlineLight
import com.kakapo.sudokukmp.designSystem.theme.outlineLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.outlineLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.outlineVariantDark
import com.kakapo.sudokukmp.designSystem.theme.outlineVariantDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.outlineVariantDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.outlineVariantLight
import com.kakapo.sudokukmp.designSystem.theme.outlineVariantLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.outlineVariantLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.primaryContainerDark
import com.kakapo.sudokukmp.designSystem.theme.primaryContainerDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.primaryContainerDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.primaryContainerLight
import com.kakapo.sudokukmp.designSystem.theme.primaryContainerLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.primaryContainerLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.primaryDark
import com.kakapo.sudokukmp.designSystem.theme.primaryDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.primaryDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.primaryLight
import com.kakapo.sudokukmp.designSystem.theme.primaryLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.primaryLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.scrimDark
import com.kakapo.sudokukmp.designSystem.theme.scrimDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.scrimDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.scrimLight
import com.kakapo.sudokukmp.designSystem.theme.scrimLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.scrimLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.secondaryContainerDark
import com.kakapo.sudokukmp.designSystem.theme.secondaryContainerDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.secondaryContainerDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.secondaryContainerLight
import com.kakapo.sudokukmp.designSystem.theme.secondaryContainerLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.secondaryContainerLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.secondaryDark
import com.kakapo.sudokukmp.designSystem.theme.secondaryDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.secondaryDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.secondaryLight
import com.kakapo.sudokukmp.designSystem.theme.secondaryLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.secondaryLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceBrightDark
import com.kakapo.sudokukmp.designSystem.theme.surfaceBrightDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceBrightDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceBrightLight
import com.kakapo.sudokukmp.designSystem.theme.surfaceBrightLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceBrightLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerDark
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerHighDark
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerHighDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerHighDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerHighLight
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerHighLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerHighLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerHighestDark
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerHighestDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerHighestDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerHighestLight
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerHighestLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerHighestLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerLight
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerLowDark
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerLowDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerLowDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerLowLight
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerLowLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerLowLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerLowestDark
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerLowestDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerLowestDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerLowestLight
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerLowestLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceContainerLowestLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceDark
import com.kakapo.sudokukmp.designSystem.theme.surfaceDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceDimDark
import com.kakapo.sudokukmp.designSystem.theme.surfaceDimDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceDimDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceDimLight
import com.kakapo.sudokukmp.designSystem.theme.surfaceDimLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceDimLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceLight
import com.kakapo.sudokukmp.designSystem.theme.surfaceLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceVariantDark
import com.kakapo.sudokukmp.designSystem.theme.surfaceVariantDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceVariantDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceVariantLight
import com.kakapo.sudokukmp.designSystem.theme.surfaceVariantLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.surfaceVariantLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.tertiaryContainerDark
import com.kakapo.sudokukmp.designSystem.theme.tertiaryContainerDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.tertiaryContainerDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.tertiaryContainerLight
import com.kakapo.sudokukmp.designSystem.theme.tertiaryContainerLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.tertiaryContainerLightMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.tertiaryDark
import com.kakapo.sudokukmp.designSystem.theme.tertiaryDarkHighContrast
import com.kakapo.sudokukmp.designSystem.theme.tertiaryDarkMediumContrast
import com.kakapo.sudokukmp.designSystem.theme.tertiaryLight
import com.kakapo.sudokukmp.designSystem.theme.tertiaryLightHighContrast
import com.kakapo.sudokukmp.designSystem.theme.tertiaryLightMediumContrast

private val lightScheme = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight,
    surfaceVariant = surfaceVariantLight,
    onSurfaceVariant = onSurfaceVariantLight,
    outline = outlineLight,
    outlineVariant = outlineVariantLight,
    scrim = scrimLight,
    inverseSurface = inverseSurfaceLight,
    inverseOnSurface = inverseOnSurfaceLight,
    inversePrimary = inversePrimaryLight,
    surfaceDim = surfaceDimLight,
    surfaceBright = surfaceBrightLight,
    surfaceContainerLowest = surfaceContainerLowestLight,
    surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = surfaceContainerLight,
    surfaceContainerHigh = surfaceContainerHighLight,
    surfaceContainerHighest = surfaceContainerHighestLight,
)

private val darkScheme = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark,
    surfaceVariant = surfaceVariantDark,
    onSurfaceVariant = onSurfaceVariantDark,
    outline = outlineDark,
    outlineVariant = outlineVariantDark,
    scrim = scrimDark,
    inverseSurface = inverseSurfaceDark,
    inverseOnSurface = inverseOnSurfaceDark,
    inversePrimary = inversePrimaryDark,
    surfaceDim = surfaceDimDark,
    surfaceBright = surfaceBrightDark,
    surfaceContainerLowest = surfaceContainerLowestDark,
    surfaceContainerLow = surfaceContainerLowDark,
    surfaceContainer = surfaceContainerDark,
    surfaceContainerHigh = surfaceContainerHighDark,
    surfaceContainerHighest = surfaceContainerHighestDark,
)

private val mediumContrastLightColorScheme = lightColorScheme(
    primary = primaryLightMediumContrast,
    onPrimary = onPrimaryLightMediumContrast,
    primaryContainer = primaryContainerLightMediumContrast,
    onPrimaryContainer = onPrimaryContainerLightMediumContrast,
    secondary = secondaryLightMediumContrast,
    onSecondary = onSecondaryLightMediumContrast,
    secondaryContainer = secondaryContainerLightMediumContrast,
    onSecondaryContainer = onSecondaryContainerLightMediumContrast,
    tertiary = tertiaryLightMediumContrast,
    onTertiary = onTertiaryLightMediumContrast,
    tertiaryContainer = tertiaryContainerLightMediumContrast,
    onTertiaryContainer = onTertiaryContainerLightMediumContrast,
    error = errorLightMediumContrast,
    onError = onErrorLightMediumContrast,
    errorContainer = errorContainerLightMediumContrast,
    onErrorContainer = onErrorContainerLightMediumContrast,
    background = backgroundLightMediumContrast,
    onBackground = onBackgroundLightMediumContrast,
    surface = surfaceLightMediumContrast,
    onSurface = onSurfaceLightMediumContrast,
    surfaceVariant = surfaceVariantLightMediumContrast,
    onSurfaceVariant = onSurfaceVariantLightMediumContrast,
    outline = outlineLightMediumContrast,
    outlineVariant = outlineVariantLightMediumContrast,
    scrim = scrimLightMediumContrast,
    inverseSurface = inverseSurfaceLightMediumContrast,
    inverseOnSurface = inverseOnSurfaceLightMediumContrast,
    inversePrimary = inversePrimaryLightMediumContrast,
    surfaceDim = surfaceDimLightMediumContrast,
    surfaceBright = surfaceBrightLightMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestLightMediumContrast,
    surfaceContainerLow = surfaceContainerLowLightMediumContrast,
    surfaceContainer = surfaceContainerLightMediumContrast,
    surfaceContainerHigh = surfaceContainerHighLightMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestLightMediumContrast,
)

private val highContrastLightColorScheme = lightColorScheme(
    primary = primaryLightHighContrast,
    onPrimary = onPrimaryLightHighContrast,
    primaryContainer = primaryContainerLightHighContrast,
    onPrimaryContainer = onPrimaryContainerLightHighContrast,
    secondary = secondaryLightHighContrast,
    onSecondary = onSecondaryLightHighContrast,
    secondaryContainer = secondaryContainerLightHighContrast,
    onSecondaryContainer = onSecondaryContainerLightHighContrast,
    tertiary = tertiaryLightHighContrast,
    onTertiary = onTertiaryLightHighContrast,
    tertiaryContainer = tertiaryContainerLightHighContrast,
    onTertiaryContainer = onTertiaryContainerLightHighContrast,
    error = errorLightHighContrast,
    onError = onErrorLightHighContrast,
    errorContainer = errorContainerLightHighContrast,
    onErrorContainer = onErrorContainerLightHighContrast,
    background = backgroundLightHighContrast,
    onBackground = onBackgroundLightHighContrast,
    surface = surfaceLightHighContrast,
    onSurface = onSurfaceLightHighContrast,
    surfaceVariant = surfaceVariantLightHighContrast,
    onSurfaceVariant = onSurfaceVariantLightHighContrast,
    outline = outlineLightHighContrast,
    outlineVariant = outlineVariantLightHighContrast,
    scrim = scrimLightHighContrast,
    inverseSurface = inverseSurfaceLightHighContrast,
    inverseOnSurface = inverseOnSurfaceLightHighContrast,
    inversePrimary = inversePrimaryLightHighContrast,
    surfaceDim = surfaceDimLightHighContrast,
    surfaceBright = surfaceBrightLightHighContrast,
    surfaceContainerLowest = surfaceContainerLowestLightHighContrast,
    surfaceContainerLow = surfaceContainerLowLightHighContrast,
    surfaceContainer = surfaceContainerLightHighContrast,
    surfaceContainerHigh = surfaceContainerHighLightHighContrast,
    surfaceContainerHighest = surfaceContainerHighestLightHighContrast,
)

private val mediumContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkMediumContrast,
    onPrimary = onPrimaryDarkMediumContrast,
    primaryContainer = primaryContainerDarkMediumContrast,
    onPrimaryContainer = onPrimaryContainerDarkMediumContrast,
    secondary = secondaryDarkMediumContrast,
    onSecondary = onSecondaryDarkMediumContrast,
    secondaryContainer = secondaryContainerDarkMediumContrast,
    onSecondaryContainer = onSecondaryContainerDarkMediumContrast,
    tertiary = tertiaryDarkMediumContrast,
    onTertiary = onTertiaryDarkMediumContrast,
    tertiaryContainer = tertiaryContainerDarkMediumContrast,
    onTertiaryContainer = onTertiaryContainerDarkMediumContrast,
    error = errorDarkMediumContrast,
    onError = onErrorDarkMediumContrast,
    errorContainer = errorContainerDarkMediumContrast,
    onErrorContainer = onErrorContainerDarkMediumContrast,
    background = backgroundDarkMediumContrast,
    onBackground = onBackgroundDarkMediumContrast,
    surface = surfaceDarkMediumContrast,
    onSurface = onSurfaceDarkMediumContrast,
    surfaceVariant = surfaceVariantDarkMediumContrast,
    onSurfaceVariant = onSurfaceVariantDarkMediumContrast,
    outline = outlineDarkMediumContrast,
    outlineVariant = outlineVariantDarkMediumContrast,
    scrim = scrimDarkMediumContrast,
    inverseSurface = inverseSurfaceDarkMediumContrast,
    inverseOnSurface = inverseOnSurfaceDarkMediumContrast,
    inversePrimary = inversePrimaryDarkMediumContrast,
    surfaceDim = surfaceDimDarkMediumContrast,
    surfaceBright = surfaceBrightDarkMediumContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkMediumContrast,
    surfaceContainerLow = surfaceContainerLowDarkMediumContrast,
    surfaceContainer = surfaceContainerDarkMediumContrast,
    surfaceContainerHigh = surfaceContainerHighDarkMediumContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkMediumContrast,
)

private val highContrastDarkColorScheme = darkColorScheme(
    primary = primaryDarkHighContrast,
    onPrimary = onPrimaryDarkHighContrast,
    primaryContainer = primaryContainerDarkHighContrast,
    onPrimaryContainer = onPrimaryContainerDarkHighContrast,
    secondary = secondaryDarkHighContrast,
    onSecondary = onSecondaryDarkHighContrast,
    secondaryContainer = secondaryContainerDarkHighContrast,
    onSecondaryContainer = onSecondaryContainerDarkHighContrast,
    tertiary = tertiaryDarkHighContrast,
    onTertiary = onTertiaryDarkHighContrast,
    tertiaryContainer = tertiaryContainerDarkHighContrast,
    onTertiaryContainer = onTertiaryContainerDarkHighContrast,
    error = errorDarkHighContrast,
    onError = onErrorDarkHighContrast,
    errorContainer = errorContainerDarkHighContrast,
    onErrorContainer = onErrorContainerDarkHighContrast,
    background = backgroundDarkHighContrast,
    onBackground = onBackgroundDarkHighContrast,
    surface = surfaceDarkHighContrast,
    onSurface = onSurfaceDarkHighContrast,
    surfaceVariant = surfaceVariantDarkHighContrast,
    onSurfaceVariant = onSurfaceVariantDarkHighContrast,
    outline = outlineDarkHighContrast,
    outlineVariant = outlineVariantDarkHighContrast,
    scrim = scrimDarkHighContrast,
    inverseSurface = inverseSurfaceDarkHighContrast,
    inverseOnSurface = inverseOnSurfaceDarkHighContrast,
    inversePrimary = inversePrimaryDarkHighContrast,
    surfaceDim = surfaceDimDarkHighContrast,
    surfaceBright = surfaceBrightDarkHighContrast,
    surfaceContainerLowest = surfaceContainerLowestDarkHighContrast,
    surfaceContainerLow = surfaceContainerLowDarkHighContrast,
    surfaceContainer = surfaceContainerDarkHighContrast,
    surfaceContainerHigh = surfaceContainerHighDarkHighContrast,
    surfaceContainerHighest = surfaceContainerHighestDarkHighContrast,
)

@Immutable
data class ColorFamily(
    val color: Color,
    val onColor: Color,
    val colorContainer: Color,
    val onColorContainer: Color
)

val unspecified_scheme = ColorFamily(
    Color.Unspecified, Color.Unspecified, Color.Unspecified, Color.Unspecified
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable() () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> darkScheme
        else -> lightScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography,
        content = content
    )
}

